#!/bin/sh
rm -r doc  # rd /s /y doc
mkdir doc  # md doc
javadoc -d doc -sourcepath src toolkit