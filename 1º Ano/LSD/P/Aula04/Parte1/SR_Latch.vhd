library IEEE;
use IEEE.STD_LOGIC_1164.all;

entity SR_Latch is
	Port( S, R : in STD_Logic;
			Q , QN : inout STD_Logic);
end SR_Latch;

architecture Behavioral of SR_Latch is
begin
	process(R,S,Q,QN)
	begin
		Q <= QN nor R;
		QN <= Q nor S;
	end process;
end behavioral;