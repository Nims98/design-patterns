package com.nims.iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowserHistory {

//   with the help of the iterator pattern we can change type of the collection without effecting other classes
//   all the implementation details resides within this class
//   meaning that if we wanted to change type of urls, only this class have to be modified
    private List<String> urls = new ArrayList<>();

    public void push(String url){
        urls.add(url);
    }

    public String pop(){
        var lastUrl = urls.get(urls.size()-1);
        urls.remove(lastUrl);
        return lastUrl;
    }
    public Iterator createIterator(){
        return new ListIterator();
    }
     public class ListIterator implements Iterator{

        private int index;
         @Override
         public boolean hasNext() {
             return (index<urls.size());
         }

         @Override
         public String current() {
             return urls.get(index);
         }

         @Override
         public void next() {
            index++;
         }
     }
}
