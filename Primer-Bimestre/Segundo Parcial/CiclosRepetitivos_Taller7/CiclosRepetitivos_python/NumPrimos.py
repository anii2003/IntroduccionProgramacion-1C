print("")
# Inicializar las variables
num = 0; i = 1; n = 0; divisor = 0

n = int(input("Ingrese el límite de números a verificar: "))

# Proceso

for i in range (n):
    num = int(input("Ingrese un número: "))

    # Verificar si un número es par o impar

    if (num%2 == 0):
        print("El número ",num," es par")
    else:
        print("El número ",num," es impar")
    
    j = 1 #Inicializar nuevamente j
    while (j <= num):
        if (num%j == 0):
            divisor = divisor + 1
        j = j + 1

    if (divisor == 2):
        print("El número ",num," es primo")
    else:
        print("El número ",num," no es primo")
    
    divisor = 0 #Inicializar divisor nuevamente