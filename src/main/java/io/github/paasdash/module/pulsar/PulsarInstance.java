package io.github.paasdash.module.pulsar;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PulsarInstance {
    private String name;

    private String host;

    private int webPort;

    private int tcpPort;

    public PulsarInstance(String name) {
        this.name = name;
    }
}
