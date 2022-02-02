#Inicializar las variales
i = 1; n = 1; suma = 0

# Ingresar los datos
print("")
n = int(input("Ingrese el límite del ciclo: "))

# Proceso

while (i <= n):
    suma = suma + i
    print(i)
    i = i + 1

print("i es: ",i)
print("La suma es: ",suma, "\n")

# Inicializar nuevamente las variables contador y suma

i = n; suma = 0

while (i >= 1):
    print("suma: ",suma)
    suma = suma + i
    print(i)
    i = i - 1

print("i es: ",i)
print("La suma es: ",suma)
print("\n")