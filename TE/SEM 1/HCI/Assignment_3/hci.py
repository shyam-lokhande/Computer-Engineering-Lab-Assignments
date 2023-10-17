from tkinter import *
from tkinter import ttk
from tkinter import messagebox
window = Tk()
window.title("Intern")
window.geometry('400x500')

X=40
Y=50

z = Label(window ,text = "Registration Form",bg="orange",fg="black",font=("Arial Bold", 15)).place(x=X*3,y=4)

window.configure(background = "BLACK")
a = Label(window ,text = "First Name").place(x=X,y=Y)
b = Label(window ,text = "Last Name").place(x=X,y=Y*2)
c = Label(window ,text = "Email Id").place(x=X,y=Y*3)
d = Label(window ,text = "Contact number").place(x=X,y=Y*4)
d = Label(window ,text = "Age").place(x=X,y=Y*5)

a1 = Entry(window).place(x=X*5,y=Y)
b1 = Entry(window).place(x=X*5,y=Y*2)
c1 = Entry(window).place(x=X*5,y=Y*3)
d1 = Entry(window).place(x=X*5,y=Y*4)

spin = Spinbox(window, from_=0, to=100, width=5)
spin.place(x=X*5,y=Y*5)

e = Label(window ,text = "Gender").place(x=X,y=Y*6)
rad1 = Radiobutton(window,text='Male', value=1)
rad2 = Radiobutton(window,text='Female', value=2)
rad1.place(x=X*5,y=Y*6)
rad2.place(x=X*7,y=Y*6)

#dropdown
f = Label(window ,text = "Preffered Domain").place(x=X,y=Y*7)
combo = ttk.Combobox(window)
combo.place(x=X*5,y=Y*7)
combo['values']= ("Web Development","Android Development","Blockchain","Marketing","Data Analytics","AI & ML")
combo.current(0)

# #checkbox
chk_state = BooleanVar()
chk_state.set(True)
statechk = Checkbutton(window, text='I accept all the terms and conditions', var=chk_state)
statechk.place(x=X*2,y=Y*8)

def clicked():    
    messagebox.showinfo('Form Submitted', 'Registration Form submitted successfully !!')

btn1 = Button(window ,text="Submit", bg="blue",fg="white",command=clicked).place(x=X*4,y=Y*9)

window.mainloop()