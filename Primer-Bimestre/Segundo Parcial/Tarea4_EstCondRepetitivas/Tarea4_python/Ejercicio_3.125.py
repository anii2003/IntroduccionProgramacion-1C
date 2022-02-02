print("")
print("Ejercicio libro Mancilla 3.125")
print("***Suma de los múltiplos de 3 o 5***")
# Inicialización de variables
suma = 0; i = 1

# Proceso
while (i <= 999):
    if ((i % 3 == 0) or (i % 5 == 0)):
        suma = suma + i

    i = i + 1

print("Respuesta: ",suma)
print("")
