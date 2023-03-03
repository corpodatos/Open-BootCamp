package com.miempresa;

public class CocheCRUDImpl implements CocheCRUD{

    public CocheCRUDImpl() {
        super();
    }


    @Override
    public void save(){}
    @Override
    public void findAll(){}

    @Override
    public void delete(){}


    String save = "guardar";
    String findAll = "buscarTodos";

    String delete = "borrar";

    @Override
    public String toString() {
        return "CocheCRUDImpl{" +
                "save='" + save + '\'' +
                ", findAll='" + findAll + '\'' +
                ", delete='" + delete + '\'' +
                '}';
    }
}
