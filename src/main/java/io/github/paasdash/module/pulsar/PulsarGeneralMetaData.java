package io.github.paasdash.module.pulsar;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PulsarGeneralMetaData {

    private List<String> tenantList;

    private List<NamespaceMetaData> namespaceMetaDataList;

    private List<TopicMetaData> topicMetaDataList;

}
