print("")
# Inicializar las variables
n = 0; divisor = 0; num = 0; menor = 0; i = 1; j = 1; primo = 0

# Ingrese los datos
print("***Programa para obtener el número primo menor***")
n = int(input("Ingrese el límite: "))

# Proceso
while (i <= n):
    num = int(input("Ingrese un número a evaluar: "))

    for j in range (0,1):
        j = 1
        while (j <= num):
            if (num % j == 0):
                divisor = divisor + 1

            j = j + 1

    if (divisor == 2):
        print("El número ",num," es primo")
        primo = primo + 1

        if (primo == 1):
            menor = num
        if (num < menor):
            menor = num
    
    divisor = 0
    i = i + 1

print("--------------------------------")
print("El número primo menor es:",menor)