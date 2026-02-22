import os
import shutil

# Simple keyword-based topic mapping
TOPICS = {
    "array": "arrays",
    "sum": "arrays",
    "string": "strings",
    "palindrome": "strings",
    "tree": "trees",
    "graph": "graphs",
    "linked": "linked_list",
    "dp": "dp",
    "dynamic": "dp",
    "search": "binary_search",
}

BASE_DIR = "../"

for file in os.listdir(BASE_DIR):
    if file.endswith((".py", ".cpp", ".java", ".c")):
        filename = file.lower()

        moved = False
        for key in TOPICS:
            if key in filename:
                folder = os.path.join(BASE_DIR, TOPICS[key])
                os.makedirs(folder, exist_ok=True)

                shutil.move(
                    os.path.join(BASE_DIR, file),
                    os.path.join(folder, file)
                )
                moved = True
                break

        if not moved:
            folder = os.path.join(BASE_DIR, "misc")
            os.makedirs(folder, exist_ok=True)

            shutil.move(
                os.path.join(BASE_DIR, file),
                os.path.join(folder, file)
            )

print("✅ Files organized!")