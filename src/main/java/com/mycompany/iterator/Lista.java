/*
 * Copyright (C) 2022 Pedro Dias
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */

package com.mycompany.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Classe Lista
 * @author Pedro Dias
 */
public class Lista implements ILista<Integer>{
    private List<Integer> lista = new ArrayList<>();

    @Override
    public Iterator createIterator() {
        return new IteratorDecrescente(this);
    }

    @Override
    public void add(Integer object) {
        lista.add(object);
    }

    @Override
    public int size() {
        return lista.size();
    }

    @Override
    public Integer get(int indice) {
        return lista.get(indice);
    }

}
