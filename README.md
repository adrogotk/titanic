# titanic

## Diseño
<img src="img/Diseño_Titanic.PNG">
```
Imports System.IO
Imports Microsoft.VisualBasic.FileIO

Module ModuleFicheros
    Public Datos As String = Application.StartupPath & "\Agenda.txt"
    Public Datos1 As String = Application.StartupPath & "\Poblaciones.txt"
    'Public conjuntoDatos
    Public Sub GrabarDatosFichero(agenda As ListView.ListViewItemCollection)

        Dim contador As Integer
        For contador = 0 To agenda.Count - 1
            My.Computer.FileSystem.WriteAllText(Datos, Format(Val(agenda(contador).Text), "0") & "#" & agenda(contador).SubItems.Item(1).Text _
          & "#" & agenda(contador).SubItems.Item(2).Text & "#" & agenda(contador).SubItems.Item(3).Text & "#" &
          agenda(contador).SubItems.Item(4).Text & "#" & agenda(contador).SubItems.Item(5).Text & "#" &
          agenda(contador).SubItems.Item(6).Text _
           & vbCrLf, True)
        Next

    End Sub
    Public Sub GrabarFicheroPoblacion(poblacion As ComboBox.ObjectCollection)
        Dim Contador As Integer
        For Contador = 0 To poblacion.Count - 1
            If poblacion(Contador) <> "" Then
                My.Computer.FileSystem.WriteAllText(Datos1, poblacion(Contador) & "#" & vbCrLf, True)
            End If
        Next
    End Sub
    Public Sub LeerDatosFichero()
        If My.Computer.FileSystem.FileExists(Datos) Then
            Dim Fichero_leer As String = Datos
            Dim Campos As String()
            Dim indi As Integer = 0
            Dim Delimitador As String = "#"
            Dim agenda As ListView.ListViewItemCollection = Frm1.agenda.Items
            Using Analizador_sintactico As New TextFieldParser(Fichero_leer)
                Analizador_sintactico.SetDelimiters(Delimitador)
                While Not Analizador_sintactico.EndOfData
                    Campos = Analizador_sintactico.ReadFields
                    agenda.Add(indi + 1)
                    agenda(indi).SubItems.Add(Campos(1))
                    agenda(indi).SubItems.Add(Campos(2))
                    agenda(indi).SubItems.Add(Campos(3))
                    agenda(indi).SubItems.Add(Campos(4))
                    agenda(indi).SubItems.Add(Campos(5))
                    agenda(indi).SubItems.Add(Campos(6))
                    indi += 1
                End While
            End Using
            My.Computer.FileSystem.DeleteFile(Datos)
        Else
        End If
    End Sub
    Public Sub LeerDatosFicheroPoblacion()
        If My.Computer.FileSystem.FileExists(Datos1) Then
            Dim Fichero_leer As String = Datos1
            Dim Campos As String()

            Dim Delimitador As String = "#"
            Using Analizador_sintactico As New TextFieldParser(Fichero_leer)
                Analizador_sintactico.SetDelimiters(Delimitador)
                While Not Analizador_sintactico.EndOfData
                    Campos = Analizador_sintactico.ReadFields
                    Frm1.poblacion.Items.Add(Campos(0))
                End While
            End Using
            My.Computer.FileSystem.DeleteFile(Datos1)
        Else
        End If
    End Sub

End Module
```
