print("")
# ****Método principal*****

# Inicializar las variables
n = 0; numP = -1; denP = 0; potP = 0; suma = 0

n = int(input("Ingrese el límite de la serie: "))

def Numerador(num):
    num = num + 2
    return num

def Denominador(den):
    den = den + 2
    return den

def Factorial(den):
    fact = 1

    for j in range (1, den+1):
        fact = fact*j
    
    return fact

def Potencia (pot):
    pot = pot + 3
    return pot

for i in range (1, n+1):
    numP = Numerador(numP)
    denP = Denominador(denP)
    factP = Factorial(denP)
    potP = Potencia(potP)

    print(numP,"^",potP,"/",denP,"!")
    print(numP,"^",potP,"/",factP,"\n")
    suma = suma + ((numP^potP)/factP)

print("La suma de la serie numérica es: ",suma)