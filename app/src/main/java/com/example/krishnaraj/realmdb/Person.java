package com.example.krishnaraj.realmdb;

import io.realm.Realm;
import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.Ignore;

/**
 * Created by KRISHNARAJ on 6/20/2016.
 */
public class Person extends RealmObject {
    // All fields are by default persisted.
//       public String name;
//        public int age;
        private String name;
        private int age;

    // Other objects in a one-to-one relation must also subclass RealmObject
       // public Dog dog;
        private Dog dog;

    // One-to-many relations is simply a RealmList of the objects which also subclass RealmObject
        //public RealmList<Cat> cats;
        private RealmList<Cat> cats;

    // You can instruct Realm to ignore a field and not persist it.
    @Ignore
      // public int tempReference;
        private int tempReference;

      // public long id;
        private long id;

                // Let your IDE generate getters and setters for you!
              // Or if you like you can even have public fields and no accessors! See Dog.java and Cat.java
                public String getName() {
                return name;
         }

                public void setName(String name) {
                this.name = name;
            }

              public int getAge() {
             return age;
            }

               public void setAge(int age) {
               this.age = age;
            }

                public Dog getDog() {
                return dog;
          }

               public void setDog(Dog dog) {
               this.dog = dog;
            }

               public RealmList<Cat> getCats() {
               return cats;
            }

                public void setCats(RealmList<Cat> cats) {
                this.cats = cats;
            }

                public int getTempReference() {
                return tempReference;
            }

                public void setTempReference(int tempReference) {
                this.tempReference = tempReference;
            }

                public long getId() {
                return id;
         }

              public void setId(long id) {
                this.id = id;
           }
}

