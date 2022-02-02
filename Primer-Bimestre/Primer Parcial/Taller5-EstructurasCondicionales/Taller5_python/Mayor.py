print("")
print("***Programa para determinar cuál es el número mayor entre 3 números***")
print("")

#Inicialización de variables

a = 0; b = 0; c = 0; mayor = 0

a = float(input("Ingrese el primer número: "))
b = float(input("Ingrese el segundo número: "))
c = float(input("Ingrese el tercer número: "))
print("")

# Proceso

if ((a >= b) & (a >= c)):
    mayor = a
    print("El número mayor es: " ,mayor)
    print("")

else:
    if (b > c):
        mayor = b
        print("El número mayor es: " ,mayor)
        print("")

    else:
        mayor = c
        print("El número mayor es: " ,mayor)
        print("")