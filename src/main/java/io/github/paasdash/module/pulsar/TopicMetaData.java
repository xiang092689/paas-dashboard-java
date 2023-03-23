package io.github.paasdash.module.pulsar;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TopicMetaData {

    private String topicName;

    private int numPartitions;

}
