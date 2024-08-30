from abc import ABC, abstractmethod

class Animal(ABC):
    @abstractmethod
    def makeSound(self):
        pass
     
    def sleep(self):
        print("Animal can Sleep")
        
class Dog(Animal):
    def makeSound(self):
        print("Bark Bark")
        
class Cat(Animal):
    def makeSound(self):
        print("mew mew")
        
obj1 = Dog()
obj2 = Cat()

obj1.makeSound()
obj1.sleep()

obj2.makeSound()
obj2.sleep()