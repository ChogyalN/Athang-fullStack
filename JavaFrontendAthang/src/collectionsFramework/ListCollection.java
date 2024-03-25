package collectionsFramework;

import java.util.ArrayList;
import java.util.List;

public class ListCollection {

    protected List<Integer> list(){
        List<Integer> integerList = new ArrayList<>();
        for(int i=1; i<5; i++){
            integerList.add((i+3)*4);
        }
        return integerList;
    }
}
