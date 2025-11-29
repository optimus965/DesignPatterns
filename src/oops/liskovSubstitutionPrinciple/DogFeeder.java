package oops.liskovSubstitutionPrinciple;

class DogFeeder extends AnimalFeeder {

    @Override
    Cat feed(Animal a) {
        return new Cat();
    }
}
