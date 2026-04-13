# ⚽ Pro Clubs Performance Engine (Java)

A modular Java-based system designed to model and evaluate professional football player data. This project serves as a technical foundation for sports data analytics, focusing on **Object-Oriented Programming (OOP)** and **Data Integrity**.

## 🚀 Key Features
* **Weighted Rating Algorithm:** Dynamically calculates player overalls based on position-specific stat importance.
* **Data Validation (Clamping):** Implements defensive programming to ensure all statistics stay within valid ranges (0-100).
* **Comparative Analysis:** Built-in logic to compare two player objects and generate performance-based start/bench recommendations.
* **Automated Classification:** Uses stat-based pattern recognition to assign player "PlayStyles" (e.g., *Finishing Expert*, *Speedster*).

## 🛠️ Technical Stack
* **Language:** Java 17+
* **Tools:** VS Code, Git/GitHub
* **Concepts:** Encapsulation, Modular Design, Algorithmic Evaluation.

## 📈 Sample Output
The system generates a human-readable comparison report in the terminal:
--- Comparison Report --- 
Jethro (89) vs Rival Scout (81) 
Recommendation: Start Jethro

## 🏗️ Future Roadmap
- [ ] Implement a `Team` class to manage player rosters.
- [ ] Add persistence (saving/loading players from a file).
- [ ] Build a basic GUI for easier data entry.

---
*Created by Jethro | Software Engineering Student @ Cardiff University*