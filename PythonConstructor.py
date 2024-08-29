class A:
    def __init__(self, model, year):
        self.model = model
        self.year = year
        
    def display(self):
        print(f"Car model is:{self.model} of year:{self.year}")
        
obj = A("BMW", 2024)
obj.display()