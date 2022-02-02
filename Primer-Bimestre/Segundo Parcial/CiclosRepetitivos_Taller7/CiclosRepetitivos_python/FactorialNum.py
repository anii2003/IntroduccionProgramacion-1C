print("")
print("***Obtener el factoria de un número***")

# Inicializar las variables
num = 0; fact = 1; i = 1

# Ingrese los datos
num = int(input("Ingrese el número para obtener el factorial: "))

while (i <= num):
    if (num > 0):
      fact = fact * i
      i = i + 1
    else:
        print("El factorial no aplica a números negativos")

print("El factorial de ",num," es: ",fact)