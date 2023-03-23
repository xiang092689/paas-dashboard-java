package io.github.paasdash.controller.pulsar;

import io.github.paasdash.module.pulsar.PulsarGeneralMetaData;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pulsar")
public class PulsarController {

    @GetMapping("/instances/{instance}/get-general-metadata")
    public ResponseEntity<PulsarGeneralMetaData> getPulsarMetaData(@PathVariable String instance){

    }

}
