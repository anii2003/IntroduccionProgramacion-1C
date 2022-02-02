print("")
# Inicializar las variables

i = 1; n = 0; num = 0; mayor = 0; menor = 0

# Ingrese los datos
print("***Encontrar el número mayor de N números***")
n = int(input("Ingrese el límite de los números para obtener el mayor: "))

#Proceso

while (i <= n):
    num = int(input("Ingrese un número: "))

    if (num > mayor):
        mayor = num

    i = i + 1

print("El número mayor de los valores ingresados es: ",mayor)

print("\n***Encontrar el número menor de N números que ingrese el usuario\n")

for i in range(n):
    num = int(input("Ingrese un número: "))
    if (i == 0):
        menor = num
    
    if (num < menor):
        menor = num
        print("***menor ←",menor)

print("El número menor es: ", menor)