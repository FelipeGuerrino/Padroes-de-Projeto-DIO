package com.passwordgen;

import java.util.HashMap;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PasswordRepository {
    
    private Map<String, String> passwords = new HashMap<>();

    public void addPassword(String key, String password){
        this.getPasswords().put(key, password);
        System.out.println(String.format("Senha %s adicionada com a chave %s", password, key));
    }

    public void printPasswords(){
        System.out.println(this.getPasswords());
    }
}
