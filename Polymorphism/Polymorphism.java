class Polymorphism {
    public static void main(String[] args) {
        Movie movie = randomMovie();
        for (int i = 1; i <= 6; i++) {
            System.out.println("movie:" + i + movie.getName() + "\n" + "Plot = " + movie.plot());
        }
    }

    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 4) + 1;
        System.out.println("Random : " + randomNumber);
        switch (randomNumber) {
        case 1:
            return new Jaws();
        case 2:
            return new IndependenceDay();
        case 3:
            return new Fish();
        case 4:
            return new Dog();
        }
        return null;
    }
}

class Movie {
    String name;

    Movie(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    String plot() {
        return "No plot here..";
    }
}

class Jaws extends Movie {
    Jaws() {
        super("Jaws");
    }

    String plot() {
        return "Shark eats lots of people";
    }
}

class IndependenceDay extends Movie {
    IndependenceDay() {
        super("IndependenceDay");
    }

    String plot() {
        return "Aliens try to take over planet earth";
    }
}

class Fish extends Movie {
    Fish() {
        super("Fish");
    }

    String plot() {
        return "Fish are eatable";
    }
}

class Dog extends Movie {
    Dog() {
        super("Dog");
    }

    String plot() {
        return "Dogs will byte";
    }
}