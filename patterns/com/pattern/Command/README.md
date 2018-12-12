## Command Pattern Description ##

**by phantasmicmeans** 

&nbsp;
The command pattern intends to encapsulate in an object all the data required for performing a given action (command),
including what method to call, the method arguments, and the object to which the method belongs

간단하게 주어진 액션을 객체로 캡슐화 한다고 생각하면 편함. 액션만 캡슐화 하는것이 아니라 이름, 매개변수 등 
필요한 정보를 저장시켜 놓는다. 

커맨드 패턴은 커맨드를 produce 하는 측과 comsume 하는 측으로 분리할 수 있음.
그렇기에 command pattern은 가끔 producer-consumer pattern으로도 불리운다.


