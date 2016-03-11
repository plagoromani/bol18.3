/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication71;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Pablite5
 */
public class NotasProg {
     private final int[] notas;
    private final String[] alumnos;
    
    public NotasProg(){
        notas=new int[30];
        alumnos=new String[30];
    }
    
    public void cargarArray(){
        Scanner teclado = new Scanner(System.in);
        for(int i = 0;i<notas.length;i++){
            System.out.println("Alumno:");
            alumnos[i]=teclado.next();
            System.out.println("Nota:");
            notas[i]=teclado.nextInt();
        }
    }
    
    public void calcularMedia(){
        int acumulador=0;
        for(int i =0;i<notas.length;i++){
            acumulador+=notas[i];
        }
        System.out.println("Media: " + acumulador/notas.length);
    }
    
    public void maximaNota(){
        int max=0;
        for(int i=0;i<notas.length;i++){
            if(notas[i]>max){
                max=notas[i];
            }
        }
        System.out.println("Nota máxima: " + max);
    }
    
    public void nAprobadosSuspensos(){
        int count_aprob=0;
        int count_susp=0;
        for(int i=0;i<notas.length;i++){
            if(notas[i]>=5){
                count_aprob++;
            }
            else{
                count_susp++;
            }
        }
        System.out.println("Aprobados: " + count_aprob);
        System.out.println("Suspensos: " + count_susp);
    }
    
    public void consultarNota(){
        boolean alumnoNoEncontrado = true;
        System.out.print("Alumno para consultar nota:");
        Scanner obx = new Scanner(System.in);
        String alumno = obx.next();
        for(int i=0;i<alumnos.length;i++){
            if(alumno.equalsIgnoreCase(alumnos[i])){
                System.out.println("La nota de " + alumnos[i] + " es " + notas[i]);
                alumnoNoEncontrado=false;
            }
        }
        if(alumnoNoEncontrado){
            System.out.println("Alumno no encontrado");
        }
    }
    
    public void consultarNota(int indice){
        System.out.println("La nota de " + alumnos[indice] + " es " + notas[indice]);
    }
    
    public void visualizarAlumnosAprobados(){
        for(int i=0;i<notas.length;i++){
            if(notas[i]>=5){
                System.out.println(alumnos[i]);
            }
        }
    }
    
    public void visualizarNotasOrdenAscendente(){
        int[] notasOrdenadas;
        notasOrdenadas=Arrays.copyOf(notas,notas.length);
        Arrays.sort(notasOrdenadas);
        for(int i=0;i<notasOrdenadas.length;i++){
            System.out.print(notasOrdenadas[i]+" ");
        }
    }
}
