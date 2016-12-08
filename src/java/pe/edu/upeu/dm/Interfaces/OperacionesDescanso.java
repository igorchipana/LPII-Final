/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.dm.Interfaces;

import java.util.List;

/**
 *
 * @author Rodrigo Gutierrez
 */
public interface OperacionesDescanso<Entidad> {
    public int create(Entidad e);
    public List<Entidad> read(int key);
    public int update(Entidad e);
    public int delete(int key);
    public List<Entidad> readall();
}
