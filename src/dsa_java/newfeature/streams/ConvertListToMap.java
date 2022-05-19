package dsa_java.newfeature.streams;

import sun.text.resources.CollationData;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Hosting {
    private int id;
    private String name;
    private long webSites;

    public Hosting(int id, String name, long webSites) {
        this.id = id;
        this.name = name;
        this.webSites = webSites;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getWebSites() {
        return webSites;
    }
}

public class ConvertListToMap {
    public static void main(String[] args) {
        List<Hosting> list = new ArrayList<>();
        list.add(new Hosting(1, "liquidweb.com", 80000));
        list.add(new Hosting(1, "liquidweb.com", 80000));
        list.add(new Hosting(2, "linode.com", 90000));
        list.add(new Hosting(3, "digitalocean.com", 120000));
        list.add(new Hosting(4, "aws.amazon.com", 200000));
        list.add(new Hosting(5, "mkyong.com", 1));
        list.add(new Hosting(8, "mkyong.com", 23));


        Map<Integer, String> idMap = list.stream().collect(Collectors.toMap(Hosting::getId, Hosting:: getName, (old, newv) -> newv));

        System.out.println(idMap);
    }
}
