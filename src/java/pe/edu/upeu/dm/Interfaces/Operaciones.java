/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.dm.Interfaces;

import java.util.List;

/**
 *
 * @author Igor
 */
public interface Operaciones<Entidad> {
    
    public boolean create(Entidad e);

    public List<Entidad> read(int key);

    public boolean delete(int key);

    public boolean update(Entidad e);

    public List<Entidad> readall();
    
}
