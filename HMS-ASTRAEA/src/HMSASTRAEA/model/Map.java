/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HMSASTRAEA.model;

import java.io.Serializable;

/**
 *
 * @author famil
 */
public class Map implements Serializable {
    private int row;
    private int column;
    private Location[][] locations;
    
    public Map()
            {
                
            }
    
    public Map(int row, int column) 
    {
        if (row < 1 || column < 1)
        {
            System.out.println("Invalid map selection.");
            return;
        }
        
        this.row = row;
        this.column = column;
        
        this.locations = new Location[row][column];
        
        for (int rows = 0; rows < row; rows++)
        {
            for (int columns = 0; columns < column; columns++)
            {
                Location location = new Location();
                location.setColumn(columns);
                location.setRow(rows);
                location.setVisited(false);
                
                locations[rows][columns] = location;
            }
        }
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + this.row;
        hash = 53 * hash + this.column;
        return hash;
    }

    @Override
    public String toString() {
        return "Map{" + "row=" + row + ", column=" + column + '}';
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Map other = (Map) obj;
        if (this.row != other.row) {
            return false;
        }
        if (this.column != other.column) {
            return false;
        }
        return true;
    }

    public int getNoOfRows() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getNoOfColumns() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
