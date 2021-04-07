package com.codepalace.chatbot.utils

import com.codepalace.chatbot.utils.Constants.OPEN_GOOGLE
import com.codepalace.chatbot.utils.Constants.OPEN_SEARCH
import com.codepalace.chatbot.utils.Constants.OPEN_WHEEL_REPAIRING_SITE
import java.sql.Date
import java.sql.Timestamp
import java.text.SimpleDateFormat

object BotResponse {

    fun basicResponses(_message: String): String {

        val random = (0..2).random()
        val message =_message.toLowerCase()

        return when {

            //Flips a coin
            message.contains("flip") && message.contains("coin") -> {
                val r = (0..1).random()
                val result = if (r == 0) "heads" else "tails"

                "I flipped a coin and it landed on $result"
            }

            //Math calculations
            message.contains("solve") -> {
                val equation: String? = message.substringAfterLast("solve")
                return try {
                    val answer = SolveMath.solveMath(equation ?: "0")
                    "$answer"

                } catch (e: Exception) {
                    "Sorry, I can't solve that."
                }
            }

            //Hello
            message.contains("hello",ignoreCase = true) ||  message.contains("hey",ignoreCase = true) ||  message.contains("hye",ignoreCase = true)  -> {
                when (random) {
                    0 -> "Hello there!"

                    1 -> "Heyy"
                    2 -> "Hyeee"
                    else -> "error" }
            }

            //How are you?
            message.contains("how are you",ignoreCase = true) -> {
                when (random) {
                    0 -> "I'm doing fine, thanks!"
                    1 -> "I'm fine" +
                            "..."
                    2 -> "Pretty good! How about you?"
                    else -> "error"
                }
            }



            message.contains("I need your help",ignoreCase = true) || message.contains("Can I ask for help",ignoreCase = true) || message.contains("Want some help",ignoreCase = true) || message.contains("I want your help",ignoreCase = true) -> {
                when (random) {
                    0 -> "How can I help you?"
                    1 -> "Sure, What kind of help you need?"
                    2 -> "Yes Sir/Madam.. Tell me about your problem.."
                    else -> "Iam here for your help.. Tell me what you want to ask"
                }
            }

            message.contains("smoke coming from car",ignoreCase = true) || message.contains("smoke",ignoreCase = true)  ||   message.contains(" engine light is on",ignoreCase = true) ||   message.contains("brake smell",ignoreCase = true) ||  message.contains("consume more gas",ignoreCase = true) || message.contains("oil",ignoreCase = true) ||    message.contains("Engine issue",ignoreCase = true) ||   message.contains("Engine problem",ignoreCase = true) ||  message.contains("Car make strange noises",ignoreCase = true) || message.contains("Engine light on",ignoreCase = true) || message.contains("Car Battery damage",ignoreCase = true) || message.contains("Car Battery corrosion",ignoreCase = true) || message.contains("oil leakage",ignoreCase = true) || message.contains("Lack of power",ignoreCase = true)  ||  message.contains("car breakdown",ignoreCase = true)-> {
                when (random) {

                    0 -> "The issue you facing is car breakdown.. \n"+
                            "Here are some tips for you ..\n"+
                        "Step 1: Turn on Your Hazard/Emergency Lights.\n"+
                            "Step 2: Slow Down and Pull off the Road.\n"+
                            "Step 3: Turn Your Wheels Away from the Road and Put on the Emergency Brake.\n"+
                    "Step 4: Stay in Your Vehicle. Step 5: Set up Flares or Triangles  Step 6: Call for Help.\n"
                    1 -> "The problem you facing is  car breakdown.. \n"+
                            "Solution for your problem, that might help you ..\n"+
                        "Step 1: Evaluate your surroundings and make sure everyone is safe \n"+
                            "Step 2: Pull your vehicle over to the shoulder, away from traffic around you. \n"+
                            "Step 3: Turn off the vehicle and allow it to rest.\n"+
                            "Step 4: Call any roadside assistance or motor club you may have.\n"
                    else-> "Main Issue is Car Breakdown..Here are some tips to resolve car breakdown issue ..\n"+
                        "Step 1: Turn on Your Hazard/Emergency Lights. \n"+
                            "Step 2: Slow Down and Pull off the Road.\n"+
                            "Step 3: Turn Your Wheels Away from the Road and Put on the Emergency Brake. \n"+
                            "Step 4: Stay in Your Vehicle.\n"+
                            "Step 5: Set up Flares or Triangles. \n"+
                            "Step 6: Call for Help.\n"

                }
            }

            message.contains("car battery is dead",ignoreCase = true) ||     message.contains("car lights not working",ignoreCase = true) ||   message.contains("car lights",ignoreCase = true) ||  message.contains("battery jump start",ignoreCase = true) ||  message.contains("car light issue",ignoreCase = true)   ||  message.contains("problem related to car light",ignoreCase = true)   ||  message.contains("gauge not working",ignoreCase = true) ||  message.contains("gauge not working",ignoreCase = true)   ||  message.contains("gauge",ignoreCase = true)  ||  message.contains("battery dead",ignoreCase = true)  ||  message.contains("electrical issue",ignoreCase = true) ||  message.contains("electrical based things not working",ignoreCase = true) || message.contains("electrical",ignoreCase = true)-> {
                when (random) {
                    0 -> "The issue you facing is called battery jump start.. \n"+
                            "Here are some tips for you ..\n"+
                            "1. Get your hands on some jumper cables – keeping some in the trunk is a good idea.\n" +
                            "You will also need somebody with a running car.\n" +
                            "\n" +
                            "2. Park the running car nose to nose with your car, so that the engines are close.\n" +
                            "Otherwise, the jumper cables may not be long enough to reach between both batteries.\n" +
                            "\n" +
                            "3.Make sure both cars are turned off before fixing the jumper cables.\n" +
                            "Engage both parking brakes and activate your hazard lights.\n" +
                            "\n" +
                            "4. Next, attach the red jumper cable clamps.\n" +
                            "They should fix to the red, “POS” or “+” terminal on the dead battering, then to the functional battery in the other vehicle.\n" +
                            "\n" +
                            "5. Attach the black cable clamps.\n" +
                            "Fix these clamps to the black terminal on the functional battery, it may also be labeled “NEG”. The other end of the black cable must be clamped to an unpainted, metal part of your car’s engine.\n" +
                            "\n" +
                            "6. Start the assisting car and let it run for a few moments to charge the dead battery.\n" +
                            "\n" +
                            "7. Attempt to start your engine\n" +
                            "If this does not work, rev the other engine and repeat this step.\n" +
                            "\n" +
                            "8. Disconnect the black clamps first, then the red clamps.\n" +
                            "Keep your car running and take it for a drive to continue recharging the battery."
                    1 -> "The problem you facing is  battery jump start.. \n"+
                                "Solution for your problem, that might help you ..\n"+
                                "1.Park the car you’ll use for jump-starting next to the one with the dead battery, positioned close enough so that the cables will reach. The vehicles shouldn't touch one another.\n" +
                            "Turn off the ignition on both cars.\n" +
                            "2. First, clamp one end of the positive cable to the dead battery’s positive clamp.\n" +
                            "3. Now have a helper connect the other end of that cable to the other battery’s positive clamp.\n" +
                            "4. Next, connect the negative cable to the negative terminal on the good battery.\n" +
                            "5. Finally, connect the other end of the negative cable to a ground on the vehicle with the dead battery. This can be the engine block or another metal surface away from the battery. Be careful not to touch the two ends of the cable together while doing this.\n" +
                            "Start the rescue car that is providing the electricity.\n" +
                            "6. Start the car with the weak battery. If it doesn’t start, check your connections and tighten or clean as needed.\n" +
                            "7. If it does start, let the problem car run for at least 20 minutes to allow the battery to recharge before shutting it off.\n" +
                            "8. If it still doesn’t start, there may be another problem. Call a local service station for help.\n" +
                            "9. Disconnect the cables in the reverse order.\n"

                    else -> "Main Issue is Battery Jump Start..Here are some tips to resolve battery jump start issue ..\n"+
                        "1. Get your hands on some jumper cables – keeping some in the trunk is a good idea.\n" +
                            "You will also need somebody with a running car.\n" +
                            "\n" +
                            "2. Park the running car nose to nose with your car, so that the engines are close.\n" +
                            "Otherwise, the jumper cables may not be long enough to reach between both batteries.\n" +
                            "\n" +
                            "3.Make sure both cars are turned off before fixing the jumper cables.\n" +
                            "Engage both parking brakes and activate your hazard lights.\n" +
                            "\n" +
                            "4. Next, attach the red jumper cable clamps.\n" +
                            "They should fix to the red, “POS” or “+” terminal on the dead battering, then to the functional battery in the other vehicle.\n" +
                            "\n" +
                            "5. Attach the black cable clamps.\n" +
                            "Fix these clamps to the black terminal on the functional battery, it may also be labeled “NEG”. The other end of the black cable must be clamped to an unpainted, metal part of your car’s engine.\n" +
                            "\n" +
                            "6. Start the assisting car and let it run for a few moments to charge the dead battery.\n" +
                            "\n" +
                            "7. Attempt to start your engine\n" +
                            "If this does not work, rev the other engine and repeat this step.\n" +
                            "\n" +
                            "8. Disconnect the black clamps first, then the red clamps.\n" +
                            "Keep your car running and take it for a drive to continue recharging the battery."
                }
            }


            //What time is it?
            message.contains("time") && message.contains("?")-> {
                val timeStamp = Timestamp(System.currentTimeMillis())
                val sdf = SimpleDateFormat("dd/MM/yyyy HH:mm")
                val date = sdf.format(Date(timeStamp.time))

                date.toString()
            }

            //Open Google
            message.contains("open",ignoreCase = true) && message.contains("google",ignoreCase = true)-> {
                OPEN_GOOGLE
            }

            //Search on the internet
            message.contains("search",ignoreCase = true)-> {
                OPEN_SEARCH
            }
            message.contains("wheel shake",ignoreCase = true) || message.contains("wheel vibration",ignoreCase = true) || message.contains("Shaking steering wheel",ignoreCase = true) || message.contains("wheel",ignoreCase = true) || message.contains("feel vibration",ignoreCase = true) || message.contains("Noise from tyre",ignoreCase = true)  || message.contains("tyre",ignoreCase = true) || message.contains("flat tyre",ignoreCase = true) -> {

                   // OPEN_WHEEL_REPAIRING_SITE;
                when (random) {
                    0 -> "1. Prepare the car \n" +
                            "Apply the handbrake and remove all passengers from the car. Take the can of sealant and compressor out of the boot.\n"+
                           "2. Locate the puncture \n" +
                             "Examine the tyre carefully to find the puncture, if you have a rip in the tyre sidewall, a hole over 4mm in the tread or the wheel itself is damaged your repair kit is unlikely to work and the tyre will need to be changed. \n"+
                           "3. Connect the repair kit \n"+
                            "Most repair kits will require you to manually squeeze all of the sealant into the tyre, via its adapter. You may have to remove the tyre valve to do so, but instructions in either your repair kit or vehicle handbook will tell you how to do this.Once all of the sealant is in the tyre, attach the compressor to the tyre valve. Then plug the compressor into the cigarette lighter or 12v socket inside your car.\n"+
               " 4. Pump up the tyre \n"+
                       "Check the car is in neutral, then start the engine and switch on the compressor. \n"+
                 "Inflate the tyre to the correct PSI/Bar recommended in your vehicle handbook. \n"+
                   " 5. Replace the tyre \n"+
                   "Once the tyre is inflated to the recommended pressure, drive to the nearest garage or tyre fitters. \n"+
                       "Do not exceed the maximum speed detailed in the car’s handbook (and usually also on the repair kit itself).\n"
                    else->" Step One: Find the Puncture. Once you're in a safe place, hop out of the car, and find the flat tire. ...\n" +
                            "Step Two: Remove the Wheel. ...\n" +
                            "Step Three: Evaluate the Puncture. ...\n" +
                            "Step Four: Remove the Problem. ...\n" +
                            "Step Five: Enlarge the Hole. ...\n" +
                            "Step Seven: Install the Plug. ...\n" +
                            "Step Eight: Reinstall the Wheel."
                }

                }


            //When the programme doesn't understand...
            else -> {
                when (random) {
                    0 -> "I don't understand..."
                    1 -> "Try asking me something different"
                    2 -> "1. Want to ask about car breakdown issue? \n"+"2. Want to ask about battery jump start issue? \n"+ "3. Want to ask about car key lockout issue? \n"+ "4. Want to ask about car out of fuel issue?\n"+ "5. Want to ask about flat tyre issue?\n"
                    else -> "I don't know"
                }
            }
        }
    }
}