print("***Programa para calcular la nota final de un alumno***"'\n')

#Ingrese la información requerida (Sobre 10 puntos)
nombre= input("Ingrese el nombre del alumno: ")

#Datos de entrada
nota_trab = int(input("Ingrese la nota de trabajos: "))
if nota_trab > 10:
    print("Ojo: La nota ingresada debe ser sobre 10 puntos")
    print("***Ingrese la nota de trabajos nuevamente***")
    print ("")
    
nota_lecc = float(input("Ingrese la nota de lecciones: "))
if nota_trab > 10:
    print("Ojo: La nota ingresada debe ser sobre 10 puntos")
    print("***Ingrese la nota de lecciones nuevamente***")
    print("")

nota_parti = float(input("Ingrese la nota de participación: "))
if nota_parti > 10:
    print("Ojo: La nota ingresada debe ser sobre 10 puntos")
    print("***Ingrese la nota de participación nuevamente***")
    print("")

nota_examfi = float(input("Ingrese la nota del examen final: "))
if nota_examfi > 10:
    print("Ojo: La nota ingresada debe ser sobre 10 puntos")
    print("***Ingrese la nota del examen final nuevamente***")
    print("")

#Proceso
T = (nota_trab * 20/100)
L = (nota_lecc * 30/100)
P = (nota_parti * 10/100)
E = (nota_examfi * 40/100)

nota_final = (T + L + P + E)

print("La nota de trabajos ponderada al 20 por ciento es: ", +T)
print("")

print("La nota de lecciones ponderada al 30 por ciento es: ", +L)
print("")

print("La nota de participación ponderada al 10 por ciento es: ", +P)
print("")

print("La nota del examen final ponderada al 40 por ciento es: ", +E)
print("")

#Salida de datos
print("La nota final del alumno es: ",nota_final)
print("")