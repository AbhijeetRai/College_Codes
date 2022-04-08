class bufferedreader {

        bufferedreader(reader in) {
        }

        String readline() {

                return "readline";
        }
}

class reader {
}

class inputstreamreader extends reader {

        inputstreamreader(inputstream in) {
        }
}

class inputstream {
}

class system {

        public static inputstream in = null;

        void initialisesystemclass() {

                in = new inputstream();
        }
}

class demo {

        public static void main(String[] args) {

                new system().initialisesystemclass();       //JVM call
              	bufferedreader br = new bufferedreader(new inputstreamreader(system.in));

                String s = br.readline();
                System.out.println(s);
        }
}
