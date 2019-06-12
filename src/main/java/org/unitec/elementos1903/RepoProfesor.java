/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.elementos1903;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Servicios Especiales
 */
public interface RepoProfesor extends MongoRepository<Profesor, Integer>{
    
}
