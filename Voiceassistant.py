import speech_recognition as sr 
import pyttsx3
import pyaudio
import googlemaps
from datetime import datetime
import mysql.connector

conn=mysql.connector.connect(user='root',password='3351@Klu',host='localhost',database='sample')

mycursor=conn.cursor()

mycursor.execute("select * from IDNAME")
obrrate = mycursor.fetchall()
print(obrrate)

 


listerner=sr.Recognizer()
try :
    
    with sr.Microphone() as source :
        print("Listening .!!!!")
        voice=listerner.listen(source)
        command =listerner.recognize_google(voice)
        command =command.lower()
        Speaker= pyttsx3.init()
        Speaker.runAndWait()
        voices=Speaker.getProperty('voices')
        Speaker.setProperty('voice', voices[3].id)
        Speaker.runAndWait()
        if 'apple' in command:
            print("Helo Boss")
            Speaker.say("Helo boss")
            Speaker.runAndWait()
            with sr.Microphone() as source1 :
              print("Listening .!!!!")
              voice2=listerner.listen(source1)
              command2=listerner.recognize_google(voice2)
              command2=command2.lower()
              if 'bring me some coffee' in command2 :
                 Speaker.say("Ahew ! please try connecting a bot ")
                 Speaker.runAndWait()
                 
              elif 'play' in command2:
                  Speaker.say("playing")
                  Speaker.runAndWait()
                  
                
              print(command)
              print(command2)
              Speaker.say(command)
              Speaker.say(command2)
              Speaker.runAndWait()
              
        else :
             
           print(command)
           saying="Helo can you try saying hey apple"
           Speaker.say(saying)
           Speaker.runAndWait()
        
except:
    print("error!")
    pass