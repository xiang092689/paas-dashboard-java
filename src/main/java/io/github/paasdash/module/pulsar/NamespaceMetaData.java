package io.github.paasdash.module.pulsar;

import io.github.protocol.pulsar.BacklogQuota;
import io.github.protocol.pulsar.BacklogQuotaType;
import io.github.protocol.pulsar.RetentionPolicies;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NamespaceMetaData {

    private String name;

    private RetentionPolicies retentionPolicies;

    private Map<BacklogQuotaType, BacklogQuota> backlogQuotaMap;
}
