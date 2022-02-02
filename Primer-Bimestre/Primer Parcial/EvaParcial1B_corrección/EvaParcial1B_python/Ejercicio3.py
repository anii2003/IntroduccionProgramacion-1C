print("")

# Datos de entrada
n = (float(input("Ingrese su calificación: ")))

# Proceso
if (n >= 3.0):
    if ((n >= 4.6) & (n <= 5.0)):
        print("Estudiante excelente")
        print("")
    else:
        if ((n >= 4.1) & (n <= 4.5)):
            print("El alumno es muy bueno")
            print("")
        else:
            if ((n >= 3.6) & (n <= 4.0)):
                print("El estudiante es bueno")
                print("")
            else:
                if ((n >= 3.3) & (n <= 3.5)):
                    print("El alumno registró un desempeño aceptable")
                    print("")
                else: 
                    if (((n >= 3.0) & (n <= 3.2))):
                        print("Alumno aprobado")
                        print("")

else:
    print("El alumno registra una calificación no aprobatoria")
    print("")