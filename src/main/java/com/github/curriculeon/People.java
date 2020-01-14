package com.github.curriculeon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

abstract public class People<SomePersonType extends Person> implements Iterable<SomePersonType>{
    protected List<SomePersonType> personList = new ArrayList<>();
    public void add(SomePersonType person){
        this.personList.add(person);
    }
    public SomePersonType findByIdea(long id){
        SomePersonType found = null;
        for(SomePersonType person : personList){
            if(person.getId()==id){
                found=person;
            }
        }
        return found;
    }
    public boolean contains(SomePersonType person){
        for(SomePersonType search : personList){
            if(search.getId()==person.getId()&&search.getName().equals(person.getName())){
                return true;
            }
        }
        return false;
    }
    public void remove(SomePersonType person){
        if(this.contains(person)){
            this.personList.remove(person);
        }
    }
    public void remove(long id){
        SomePersonType personR = this.findByIdea(id);
        if(personR!=null){
            this.remove(personR);
        }
    }
    public void removeAll(){
        this.personList= new ArrayList<>();
    }
    public int count(){
        return this.personList.size();
    }

   abstract public SomePersonType[] toArray();


    @Override
    public Iterator<SomePersonType> iterator() {
        return this.personList.iterator();
    }
}
