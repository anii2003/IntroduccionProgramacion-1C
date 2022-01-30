print("")
# Inicialización de variables
a = 0; b = 1; c = 0; i = 1; n = 0

# Ingresar los datos
print("***Serie de Fibonacci***")
n = int(input("Ingrese la cantidad de elementos para la serie: "))

# Proceso
while (i <= n):
    print(a)
    c = a + b
    a = b
    b = c
    i = i + 1
    