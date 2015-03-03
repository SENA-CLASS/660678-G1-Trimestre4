/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.ejemplocoleccionnes.implementaciones;

import com.sun.jmx.remote.internal.ArrayQueue;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.PriorityBlockingQueue;

/**
 *
 * @author Enrique Moreno
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //objetos a partir de la interface Collection
        Collection<Integer> c11= new ArrayList<>();
        Collection<Integer> c12= new ArrayDeque<>();
        Collection<String> c13= new ArrayBlockingQueue<>(1024);
        Collection<Integer> c14= new ArrayQueue<>(1024);//desaprobado
        
        Collection<Integer> c2= new Stack<>();
        
        Collection<Integer> c31= new LinkedList<>();
        Collection<Integer> c32= new LinkedHashSet<>();
        Collection<Integer> c33= new LinkedBlockingDeque<>();
        Collection<Integer> c34= new LinkedBlockingQueue<>();
        Collection<Integer> c35= new LinkedTransferQueue<>();
        
        Collection<Integer> c41 = new PriorityQueue<>();
        Collection<Integer> c42 = new PriorityBlockingQueue<>();
        
        Collection<Integer> c51 = new HashSet<>();
        
        Collection<Integer> c61 = new TreeSet<>();
        
        //objetos a partir de la interface List
        List<Integer> ic11= new ArrayList<>();
        List<Integer> ic12= new ArrayQueue<>(1024);
        
        BlockingQueue<Integer> ic13= new ArrayBlockingQueue<>(1024);
//desaprobado
        
        List<Integer> ic2= new Stack<>();
        
        List<Integer> ic31= new LinkedList<>();
        Queue<Integer> ic312= new LinkedList<>();
        HashSet<Integer> ic32= new LinkedHashSet<>();
        Queue<Integer> ic33= new LinkedBlockingDeque<>();
        Queue<Integer> ic34= new LinkedBlockingQueue<>();
        Queue<Integer> ic35= new LinkedTransferQueue<>();
        
        Queue<Integer> ic37= new PriorityQueue<>();
        Queue<Integer> ic38= new PriorityBlockingQueue<>();
        
        Set<Integer> ic51 = new HashSet<>();
        
        Set<Integer> ic61 = new TreeSet<>();
        
        //impletacion de clases concretas
        ArrayList<Integer> cc11 = new ArrayList<>();
        Stack<Integer> cc12 = new Stack<>();
        PriorityQueue<Integer> cc13 = new PriorityQueue<>();
        PriorityBlockingQueue<Integer> cc14 = new PriorityBlockingQueue<>();
        HashSet<Integer> cc15 = new HashSet<>();
        HashSet<Integer> cc16 = new LinkedHashSet<>();
        TreeSet<Integer> cc17 = new TreeSet<>();
        
        
        List<Integer> lista1 = new ArrayList<>();
        ArrayList<Integer> lista2 = new ArrayList<>();
        
        //colecciones con indices hash
        Map  pm1 = new HashMap();
        Map pm2 = new TreeMap();
        
        HashMap<Integer,Integer> cm1 = new HashMap<>();
        TreeMap<Integer,Integer> tm1 = new TreeMap();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
