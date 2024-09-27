package com.campusdual.classroom;

import java.text.Normalizer;

public class Contact implements ICallActions {

    private String name;
    private String Surnames;
    private String Phone;
    private String code;

    public Contact(String nombre, String apellidos, String numeroTelefono) {
        this.name = nombre;
        this.Surnames = apellidos;
        this.Phone = numeroTelefono;
        this.code = "";


        nombre = quitarDiacriticos(nombre.toLowerCase());
        apellidos = quitarDiacriticos(apellidos.toLowerCase());

        String codes = Character.toString(nombre.charAt(0));

        String[] apellidosArray = apellidos.split(" ");
        System.out.println(apellidosArray.length);
        if((apellidosArray.length>1)){
            if (apellidosArray.length>2){

                for (int i = 0;i< apellidosArray.length; i++){
                if (i == 0){
                    codes += Character.toString(apellidosArray[i].charAt(0));
                }else{
                   codes += apellidosArray[i];
                }
                }

            }else{
                codes += apellidosArray[0].charAt(0) +apellidosArray[1];

            }
        }else{ // Solo un apellido
            codes += apellidos;
        }

        this.code = codes;



    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPhone() {
        return Phone; // Usar minúscula
    }

    public void setPhone(String numeroTelefono) {
        this.Phone = numeroTelefono; // Usar minúscula
    }

    public String getSurnames() {
        return Surnames; // Usar minúscula
    }

    public void setSurnamess(String apellidos) {
        this.Surnames = apellidos; // Usar minúscula
    }

    public String getName() {
        return name;
    }

    public void setName(String nombre) {
        this.name = nombre;
    }
    // Método para quitar los diacríticos
    private String quitarDiacriticos(String texto) {
        String textoNormalizado = Normalizer.normalize(texto, Normalizer.Form.NFD);
        return textoNormalizado.replaceAll("\\p{InCombiningDiacriticalMarks}+", "").toLowerCase();
    }


    @Override
    public void callMyNumber() {
        System.out.println("Me estoy llamando a mí mismo. Nombre: " + this.name + " " + this.Surnames + ", TLF: " + this.Phone);

    }

    @Override
    public void callOtherNumber(String number) {

        System.out.println("Estoy llamando al número " + number + ". Nombre: " + this.name + " " + this.Surnames);
    }

    @Override
    public void showContactDetails() {
        System.out.println("Nombre: " + name + ", Apellidos: " + Surnames + ", Teléfono: " + Phone + ", Código: " + code);
    }

    @Override
    public String toString() {
        return "Contact{" +
                "nombre='" + name + '\'' +
                ", apellidos='" + Surnames + '\'' +
                ", numeroTelefono='" + Phone + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
