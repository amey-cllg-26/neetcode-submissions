class DynamicArray:
  def __init__(self, capacity):
      self.arr=[None]*capacity
      self.capacity=capacity
      self.size=0
  def get(self,i):
    return self.arr[i]
  def set(self,i,n):
    self.arr[i]=n
  def getSize(self):
    return self.size
  def getCapacity(self):
    return self.capacity
  def resize(self):
    newCapacity = self.capacity*2
    newarr=[None]*newCapacity
    for i in range(self.size):
      newarr[i]=self.arr[i]
    self.arr=newarr
    self.capacity=newCapacity
  def pushback(self,n):
    if(self.size==self.capacity):
      self.resize()
    self.arr[self.size]=n
    self.size += 1
  def popback(self):
    self.size -= 1
    return self.arr[self.size]