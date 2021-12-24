package ma.education.tp5.annotations;

import ma.education.tp5.annotations.Client;

import java.util.Comparator;
public class CodeComparator implements Comparator<Client> {
    @Override
    public int compare(Client o1, Client o2) {
        return o1.code-o2.code;
    }
}
