print("")
# Programa que se detiene cuando se ingresa una nota mayor a 100

# Inicializar las variables
i = 1; n = 100; nota = 0

#Proceso

while ((nota <= n) and (nota >= 0)):
    nota = float(input("Ingrese una calificación: "))
    
    if ((nota <= n) & (nota>=0)):
        print(nota)
        i = i + 1

    else:
        print("Calificación inválida, por favor vuelva a ingresar")

