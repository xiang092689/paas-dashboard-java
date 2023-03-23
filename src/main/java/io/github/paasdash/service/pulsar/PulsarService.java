package io.github.paasdash.service.pulsar;

import io.github.paasdash.module.pulsar.NamespaceMetaData;
import io.github.paasdash.module.pulsar.PulsarGeneralMetaData;
import io.github.paasdash.module.pulsar.PulsarInstance;
import io.github.paasdash.module.pulsar.TopicMetaData;
import io.github.protocol.pulsar.PulsarAdmin;
import io.github.protocol.pulsar.PulsarAdminException;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PulsarService {

    @Autowired
    private PulsarInstanceService pulsarInstanceService;

    public PulsarGeneralMetaData getPulsarMetaData(@NotNull String instance) throws PulsarAdminException {
        PulsarAdmin admin = pulsarInstanceService.getPulsarAdmin(instance);
        if (admin == null) {
            throw new IllegalArgumentException("pulsar instance is not configured properly");
        }
        List<String> tenantList = admin.tenants().getTenants();
        List<String> namespaceList = admin.namespaces().getTenantNamespaces();
        List<NamespaceMetaData> namespaceMetaDataList = new ArrayList<>();
        List<TopicMetaData> topicMetaDataList = new ArrayList<>();
        return new PulsarGeneralMetaData(tenantList, namespaceMetaDataList, topicMetaDataList);
    }

}
