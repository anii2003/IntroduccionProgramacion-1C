print("")
# Inicializar las variables
aprob = 0; reprob = 0; nota = 0; n = 0; i = 1

# Ingrese los datos
print("Programa para calcular alumnos reprobados y aprobados")
n = int(input("Ingrese un límite: "))
print("***A continuación ingrese únicamente calificaciones de 0 a 10 puntos***")
print("Si ingresa valores menores a 0 o mayores a 10 el proceso se interrumpirá")

#Proceso

while ((i <= n) and (nota >= 0) and (nota <= 10)):
    nota = float(input("Ingrese una calificación: "))

    if ((nota>=7) and (nota<=10)):
        print("Alumno aprobado")
        aprob = aprob + 1
        i = i + 1

    else:
        if ((nota >= 0) and (nota < 7)):
            print("Alumno reprobado")
            reprob = reprob + 1
            i = i + 1

print("------------")
print("Resultados: ")
print("Existen ",aprob," alumnos aprobados")
print("Existen ",reprob," alumnos reprobados")