package org.UDFProjLingProg.signacle.service;

import java.util.List;
import java.util.Optional;
import org.UDFProjLingProg.signacle.entities.DTO.AbstractEntityDTO;
import java.util.UUID;

public interface GenericService<D extends AbstractEntityDTO> {

    D save(D d) throws Exception;

    Optional<D> findOneById(UUID id);

    void delete(UUID id) throws Exception;

    List<D> findAll();

    List<D> diffBetweenBasedOnId(List<D> aList, List<D> bList);


}
