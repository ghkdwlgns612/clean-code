package com.example.cleancode.chapter3.sideeffect;

public class UserValidator {
    private Cryptographer cryptographer;

    public boolean checkPassword(String username, String password) {
        User user = UserGateWay.findByName(username);
        if (user != User.NULL) {
            String codedPhrase = user.getPhraseEncodedByPassword();
            String phrase = cryptographer.decrypt(codedPhrase, password);
            if ("Valid Password".equals(phrase)) {
                Session.initialize();
                return true;
            }
        }
        return false;
    }
}
