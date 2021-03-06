package com.eigenbaumarkt.spring5mvc.restapplication.api.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VendorListDTO {

    @JsonProperty("vendors")
    List<VendorDTO> vendorDTOs;

}
