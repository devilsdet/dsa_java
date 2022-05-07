package dsa_java.techiedelight.sorting;

import java.util.Arrays;
import java.util.List;

class DatabaseTransactions {
    String name;
    String record;
    int timeStamp;
    char operation;

    public DatabaseTransactions(String name, String record, int timeStamp, char operation) {
        this.name = name;
        this.record = record;
        this.timeStamp = timeStamp;
        this.operation = operation;
    }

    @Override
    public String toString() {
        return "DatabaseTransactions{" +
                "name='" + name + '\'' +
                ", record='" + record + '\'' +
                ", timeStamp=" + timeStamp +
                ", operation=" + operation +
                '}';
    }
}

public class DatabaseReadWriteConflict {
    public static void main(String[] args) {
        List<DatabaseTransactions> transactions = Arrays.asList(
                new DatabaseTransactions("T1", "A", 0, 'R'),
                new DatabaseTransactions("T2", "A", 2, 'W'),
                new DatabaseTransactions("T3", "B", 4, 'W'),
                new DatabaseTransactions("T4", "C", 5, 'W'),
                new DatabaseTransactions("T5", "B", 7, 'R'),
                new DatabaseTransactions("T6", "C", 8, 'W'),
                new DatabaseTransactions("T7", "A", 9, 'R'));
        System.out.println(transactions);
        transactions.sort((x, y) -> {
            if(x.record.equals(y.record)) {
                return x.timeStamp - y.timeStamp;
            } else {
                return x.record.compareTo(y.record);
            }
        });
        System.out.println(transactions);

        for(int i=0; i<transactions.size()-1; i++) {
            int j = i-1;
            while ( j>=0
                    && transactions.get(i).record.equals(transactions.get(j).record)
                    && transactions.get(i).timeStamp - transactions.get(j).timeStamp <=5
                  ) {
                    if(transactions.get(i).operation == 'W'
                       || transactions.get(j).operation == 'W') {
                        System.out.println("Transaction " + transactions.get(j).name + " & " + transactions.get(i).name
                                + " are involved in " + transactions.get(j).operation
                                + transactions.get(i).operation + " conflict");
                    }
                    j--;
            }

        }
    }
}
