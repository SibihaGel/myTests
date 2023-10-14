package org.example;


    //listing 3
// A simple generic class with two type
// parameters: T and V.
    class TwoGen<T, V> {
        T ob1;
        V ob2;

        // Pass the constructor a reference to
        // an object of type T.


        public void setOb1(T ob1) {
            this.ob1 = ob1;
        }

        public void setOb2(V ob2) {
            this.ob2 = ob2;
        }

        public TwoGen(T ob1, V ob2) {
            this.ob1 = ob1;
            this.ob2 = ob2;
        }

        // Show types of T and V.
        void showTypes() {
            System.out.println("Type of T is " + ob1.getClass().getName());

            System.out.println("Type of V is " + ob2.getClass().getName());
        }

        T getob1() {
            return ob1;
        }

        V getob2() {
            return ob2;
        }
    }

    // Demonstrate TwoGen3.
    class Es3_SimpGen3 {
        public static void main(String args[]) {

            TwoGen<Integer, String> tgObj = new TwoGen<Integer, String>(88, "Gen3erics");
            TwoGen<String, String> tgObject = new TwoGen<>("Sergei", "Zatsepin");
            TwoGen<? extends String,? extends String> present = new TwoGen<>("Sergei", "Zatsepin");


            // Show the types.
            tgObj.showTypes();
            tgObject.showTypes();
            present.showTypes();

            // Obtain and show values.
            int v = tgObj.getob1();
            System.out.println("value: " + v);



            String str = tgObj.getob2();
            System.out.println("value: " + str);

            String string1 = tgObject.getob1();
            System.out.println("value: " + string1);

            Object objectPresent = present.getob1();
            String stringPresent = present.getob2();
            present.setOb1(null);
            System.out.println("values T, V : " + objectPresent + ", " + stringPresent);
            System.out.println("value : "   );


        }
    }

