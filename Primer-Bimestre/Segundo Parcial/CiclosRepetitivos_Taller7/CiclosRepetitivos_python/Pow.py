# Inicializar las variables
base = 0
pot = 0
result = 1
i = 1

#Ingrese los datos
base = int(input("Ingrese la base: "))
pot = int(input("Ingrese la potencia: "))

#Proceso
while(i <= pot):
    result = result * base
    i = i + 1

print("La potencia de ",base,"es: ",result)
